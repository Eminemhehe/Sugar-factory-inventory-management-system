package demo;

import com.jlrfid.service.GetReadData;
import com.jlrfid.service.MainHandler;
import com.jlrfid.service.RFIDException;

public class OnecReadDemo implements GetReadData{

	/**
	 * @param args
	 * @throws RFIDException 
	 */
	public static void main(String[] args) throws RFIDException {
		// TODO Auto-generated method stub

		MainHandler handler = new MainHandler();
		if(handler.dllInit("R2k.dll")){
			if(handler.deviceInit("10.10.100.254",0, 20058)){
				//System.out.println(handler.StopInv());
				handler.InvOnce(new OnecReadDemo());//回调函数
			}
		}
	}

	public void getReadData(String data, int antNo) {
		if ("F0".equals(data)) {
			System.out.println("天线1寻卡结束！");
		}else if ("F1".equals(data)) {
			System.out.println("天线2寻卡结束！");
		}else if ("F2".equals(data)) {
			System.out.println("天线3寻卡结束！");
		}else if ("F3".equals(data)) {
			System.out.println("天线4寻卡结束！");
		}else if(!"".equals(data)){
			System.out.println("数据：" + data + "  天线：" + antNo);
		}
	}

}
