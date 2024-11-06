package InterviewQuestions.PaymentGateway.User;

public class UserController {
    UserService userService;

    public UserController()
    {
        userService=new UserService();
    }
    public UserDO addUser(UserDO userDOObj)
    {
        return userService.addUser(userDOObj);
    }
    public UserDO getUser(int userId)
    {
        return userService.getUser(userId);
    }
}
