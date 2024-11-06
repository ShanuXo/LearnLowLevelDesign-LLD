package InterviewQuestions.PaymentGateway.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {
    static List<User> userList=new ArrayList<>();

    public UserDO addUser(UserDO _userDO)
    {
        User userObj = new User();
        userObj.setUserName(_userDO.getName());
        userObj.setUserEmail(_userDO.getEmail());
        userObj.setUserId((int) new Random().nextInt(100-10)+10);
        userList.add(userObj);
        return convertUserDOToUser(userObj);
    }
    public UserDO getUser(int userId)
    {
        for(User user:userList)
        {
            if(user.getUserId()==userId)
            {
                return convertUserDOToUser(user);
            }
        }
        return null;
    }

    private UserDO convertUserDOToUser(User _userObj)
    {
        UserDO userDO=new UserDO();
        userDO.setName(_userObj.getUserName());
        userDO.setEmail(_userObj.getUserEmail());
        userDO.setUserId(_userObj.getUserId());
        return userDO;
    }
}
