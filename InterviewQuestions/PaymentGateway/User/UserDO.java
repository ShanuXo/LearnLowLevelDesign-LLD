package InterviewQuestions.PaymentGateway.User;

public class UserDO {
    int id;
    String Name;
    String Email;


    public int getUserId() { return id;}
    public void setUserId(int userId) { this.id = id; }

    public String getName() { return Name;}
    public void setName(String Name) { this.Name = Name; }

    public String getEmail() { return Email;}
    public void setEmail(String Email) { this.Email = Email; }
}
