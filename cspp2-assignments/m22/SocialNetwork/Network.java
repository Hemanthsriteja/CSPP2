import java.util.ArrayList;
import java.util.Arrays;
class Network {

    private List<User> users;

    public Network() {
        users = new List<User>();
    }

    public void addConnection(String username, String friend) {
        int index = users.indexOf(new User(username));
        if (index == -1) {
            System.out.println("Not a user in Network");
            return;
        } else {
            if (users.get(index).getConnection().contains(friend) == false) {
                users.get(index).getConnection().add(friend);
            }
        }
    }

    public void addNewUser(String username, List<String> connections) {
        if (users.size() == 0) {
            users.add(new User(username, connections));
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUsername().equals(username)) {
                    System.out.println("User already exists");
                    return;
                }
            }
            users.add(new User(username, connections));
        }
    }
    public List<String> getConnection(String username) {
        int index = users.indexOf(new User(username));
        if (index != -1) {
            return users.get(index).getConnection();
        }
        return null;
    }
    public List<String> getCommonConnection(String username, String username1) {
        List<String> mutual = new List<String>();
        List<String> frnslistA = getConnection(username);
        List<String> frnslistB = getConnection(username1);
        for (int i = 0; i < frnslistA.size(); i++) {
            if (frnslistB.contains(frnslistA.get(i))) {
                mutual.add(frnslistA.get(i));
            }
        }
        return mutual;
    }
    public String toString() {
        StringBuffer s = new StringBuffer();
        ArrayList list = new ArrayList();
        for (int i = 0; i < users.size(); i++) {
            list.add(users.get(i).getUsername());
        }
        java.util.Collections.sort(list);
        for (int i = 0; i < users.size(); i++) {
            int index = users.indexOf(new User((String)list.get(i)));
            s.append(users.get(index));
        }
        String string = s.toString();
        return string.substring(0, string.length() - 2);
    }
}