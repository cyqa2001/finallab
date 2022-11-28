package cn.edu.scau.cmi.ouyangqiaoke;

import cn.edu.scau.cmi.ouyangqiaoke.view.IndexView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalLabApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        //SpringApplication.run(FinallabApplication.class, args);
        launch(FinalLabApplication.class, IndexView.class, args);
    }

}
