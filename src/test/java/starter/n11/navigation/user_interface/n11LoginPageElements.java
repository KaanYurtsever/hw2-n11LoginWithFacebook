package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {
   public static Target FACEBOOK_BOX = Target.the("facebook box").locatedBy(".facebook_large.medium.facebookBtn.btnLogin");
   public static Target FACEBOOKEMAIL_FIELD = Target.the("facebook email box").locatedBy(".inputtext._55r1.inputtext.inputtext");
   public static Target FACEBOOKPASSWORD_FIELD = Target.the("facebook password box").locatedBy("#pass");
   public static Target LOGIN_BOX = Target.the("login box").located(By.name("login"));




}
