package InterviewQuestions.PaymentGateway.Instrument;



public class InstrumentDO {
   int instrumentID;
   int userID;
   InstrumentType type;
   String bankAccNo;
   String ifscCode;
   String cardNumber;
   String cvvNumber; 

   public int getInstrumentID() { return instrumentID; }
   public void setInstrumentID(int instrumentID) { this.instrumentID = instrumentID; }

   public int getUserID() { return userID; }
   public void setUserID(int userID) { this.userID = userID ;}

   public InstrumentType getInstrumentType() { return type; }
   public void setUserID(InstrumentType type) { this.type = type ;}

   public String getBankAccountNumber() { return bankAccNo; }
   public void setBankAccountNumber(String bankAccNo) { this.bankAccNo = bankAccNo ;}

   public String getIfscCode() { return ifscCode; }
   public void setIfscCode(String ifscCode) { this.ifscCode = ifscCode ;}

   public String getCardNumber() { return cardNumber; }
   public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber ;}

   public String getCVVNumber() { return cvvNumber; }
   public void setCVVNumber(String cvvNumber) { this.cvvNumber = cvvNumber ;}

}
