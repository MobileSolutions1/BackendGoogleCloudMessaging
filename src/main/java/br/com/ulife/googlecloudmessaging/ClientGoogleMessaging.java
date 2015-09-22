package br.com.ulife.googlecloudmessaging;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import java.io.IOException;

/**
 *
 * @author marcelo
 */
public class ClientGoogleMessaging {

    private static final String CHAVE_API = "AIzaSyC3mluaIT8sbdXpJCgf-s_SUkRKTEmpCgg";
    private static final String REGISTRO_ID_DEVICE = "APA91bHBWyDwavSRJY64SlPHd18pgS-C16Kj6hy1rEKyWFGyO3-ZvZBCichtpevNrxsVA3GvS3qOIe0l83FdKo5yVsXqPye8Hz8c_wtnnLESEUOFjzYJCqwU5e4XzEoqOdrOYx3BWIKl";

    public static void main(String[] args) {
        try {
            Sender senderMgs = new Sender(CHAVE_API);
            Message mensagem = new Message.Builder().addData("msg", "teste " + System.currentTimeMillis()).build();
            Result resultado = senderMgs.send(mensagem, REGISTRO_ID_DEVICE, 5);
            System.out.print("Mensagem: " + mensagem.getData().get("msg"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
