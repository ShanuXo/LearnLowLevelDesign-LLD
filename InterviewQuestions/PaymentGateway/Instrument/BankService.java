package InterviewQuestions.PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService{
    

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO)
    {
        BankInstrument bankInstrument =new BankInstrument();

        bankInstrument.instrumentID=new Random().nextInt(100-10)+10;
        bankInstrument.bankAcNumber=instrumentDO.bankAccNo;
        bankInstrument.ifscCode=instrumentDO.ifscCode;
        bankInstrument.instrumentType=InstrumentType.BANK;
        bankInstrument.userID = instrumentDO.userID;

        List<Instrument> userInstrumentList = userVsInstruemnts.get(bankInstrument.userID);

        if(userInstrumentList == null)
        {
            userInstrumentList = new ArrayList<>();
            userVsInstruemnts.put(bankInstrument.userID, userInstrumentList);
        }
        userInstrumentList.add(bankInstrument);

        return mapBankInstrumentToInstrumentDO(bankInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserID(int userID)
    {
        List<Instrument> userInstruments = userVsInstruemnts.get(userID);
        List<InstrumentDO> userInstrumentFetched = new ArrayList<>();

        for(Instrument instrument : userInstruments)
        {
            if(instrument.getInstrumentType() == InstrumentType.BANK)
            {
                userInstrumentFetched.add(mapBankInstrumentToInstrumentDO((BankInstrument) instrument));
            }
        }
        return userInstrumentFetched;
    }

    public InstrumentDO mapBankInstrumentToInstrumentDO(BankInstrument bankInstrument)
    {
        InstrumentDO instrumentDOObj = new InstrumentDO();
        instrumentDOObj.type = InstrumentType.BANK;
        instrumentDOObj.instrumentID = bankInstrument.instrumentID;
        instrumentDOObj.bankAccNo = bankInstrument.bankAcNumber;
        instrumentDOObj.ifscCode = bankInstrument.ifscCode;
        instrumentDOObj.userID = bankInstrument.userID;
        return instrumentDOObj;
    }

}
