package InterviewQuestions.PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{
    
    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO)
    {
        CardInstrument cardInstrument =new CardInstrument();

        cardInstrument.instrumentID=new Random().nextInt(100-10)+10;
        cardInstrument.cardNumber=instrumentDO.cardNumber;
        cardInstrument.cvvNumber=instrumentDO.cvvNumber;
        cardInstrument.instrumentType=InstrumentType.CARD;
        cardInstrument.userID = instrumentDO.userID;

        List<Instrument> userInstrumentList = userVsInstruemnts.get(cardInstrument.userID);

        if(userInstrumentList == null)
        {
            userInstrumentList = new ArrayList<>();
            userVsInstruemnts.put(cardInstrument.userID, userInstrumentList);
        }
        userInstrumentList.add(cardInstrument);

        return mapBankInstrumentToInstrumentDO(cardInstrument);
    }

    @Override
    public List<InstrumentDO> getInstrumentByUserID(int userID)
    {
        List<Instrument> userInstruments = userVsInstruemnts.get(userID);
        List<InstrumentDO> userInstrumentFetched = new ArrayList<>();

        for(Instrument instrument : userInstruments)
        {
            if(instrument.getInstrumentType() == InstrumentType.CARD)
            {
                userInstrumentFetched.add(mapBankInstrumentToInstrumentDO((CardInstrument) instrument));
            }
        }
        return userInstrumentFetched;
    }

    public InstrumentDO mapBankInstrumentToInstrumentDO(CardInstrument cardInstrument)
    {
        InstrumentDO instrumentDOObj = new InstrumentDO();
        instrumentDOObj.type = InstrumentType.CARD;
        instrumentDOObj.instrumentID = cardInstrument.instrumentID;
        instrumentDOObj.cardNumber = cardInstrument.cardNumber;
        instrumentDOObj.cvvNumber = cardInstrument.cvvNumber;
        instrumentDOObj.userID = cardInstrument.userID;
        return instrumentDOObj;
    }
}
