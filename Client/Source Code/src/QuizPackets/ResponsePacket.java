package QuizPackets;

import java.io.Serializable;

public class ResponsePacket implements Serializable{
	public static final long serialVersionUID = 11911L;
	public int questionSequenceNo;
	public String uID;
	public String answer;
	public boolean result;
	public boolean ack;
	public ResponsePacket(int quesSeq, String UID, String ans, boolean res, boolean ack) {
		questionSequenceNo = quesSeq;
		uID = UID;
		answer = ans;
		result = res;
		this.ack = ack;
	}
}
