package InterviewQuestions.PaymentGateway.Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {
    static Map<Integer,List<Instrument>> userVsInstruemnts = new HashMap<>();

    public abstract InstrumentDO addInstrument(InstrumentDO instrumentDO);
    public abstract List<InstrumentDO> getInstrumentByUserID(int userID);
}
