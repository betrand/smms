/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.io.Log;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import generated.StateMachineBase;
import com.codename1.ui.util.Resources;
import com.uptitek.call.mobile.users.UsersService;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     *
     * @param res
     */
    @Override
    protected void initVars(Resources res) {
    }

    protected boolean onRequestAccessSend() {

        return true;
    }

    protected boolean onMainRequestAccess() {

        return true;
    }
   
    @Override
    protected void onLoginForm_LoginAction(Component c, ActionEvent event) {
        System.out.print("Executed onLoginForm_LoginAction");
        TextField userNameField = (TextField) findByName("Username", c);
        TextField passwordField = (TextField) findByName("Password", c);
        CheckBox rememberField = (CheckBox) findByName("Remember", c);

        String username = userNameField.getText();
        String password = passwordField.getText();
        boolean remember = rememberField.isSelected();
        String greet = "Hello, " + username + "! Your Password is : " + password + " and Remember me is " + remember;
        
        UsersService.postAndGetFromCallService(greet);
        
        Dialog.show("Greetings", greet, "OK", null);
    }
}
