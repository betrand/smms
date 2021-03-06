/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findUsernameContainer(Component root) {
        return (com.codename1.ui.Container)findByName("UsernameContainer", root);
    }

    public com.codename1.ui.Container findUsernameContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("UsernameContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("UsernameContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findResetPassword(Component root) {
        return (com.codename1.ui.Button)findByName("ResetPassword", root);
    }

    public com.codename1.ui.Button findResetPassword() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("ResetPassword", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("ResetPassword", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findWelcome1(Component root) {
        return (com.codename1.ui.Label)findByName("Welcome1", root);
    }

    public com.codename1.ui.Label findWelcome1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Welcome1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Welcome1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCancel(Component root) {
        return (com.codename1.ui.Button)findByName("Cancel", root);
    }

    public com.codename1.ui.Button findCancel() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Cancel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Cancel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findSubmitLogins(Component root) {
        return (com.codename1.ui.Container)findByName("SubmitLogins", root);
    }

    public com.codename1.ui.Container findSubmitLogins() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("SubmitLogins", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("SubmitLogins", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLogin(Component root) {
        return (com.codename1.ui.Button)findByName("Login", root);
    }

    public com.codename1.ui.Button findLogin() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Login", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findPasswordContainer(Component root) {
        return (com.codename1.ui.Container)findByName("PasswordContainer", root);
    }

    public com.codename1.ui.Container findPasswordContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("PasswordContainer", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("PasswordContainer", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findUsername(Component root) {
        return (com.codename1.ui.Component)findByName("Username", root);
    }

    public com.codename1.ui.Component findUsername() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Username", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Username", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findRemember(Component root) {
        return (com.codename1.ui.Component)findByName("Remember", root);
    }

    public com.codename1.ui.Component findRemember() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Remember", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Remember", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findRequesteAccess(Component root) {
        return (com.codename1.ui.Button)findByName("RequesteAccess", root);
    }

    public com.codename1.ui.Button findRequesteAccess() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("RequesteAccess", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("RequesteAccess", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField", root);
    }

    public com.codename1.ui.TextField findTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findWelcome(Component root) {
        return (com.codename1.ui.Component)findByName("Welcome", root);
    }

    public com.codename1.ui.Component findWelcome() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Welcome", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Welcome", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findMain(Component root) {
        return (com.codename1.ui.Component)findByName("Main", root);
    }

    public com.codename1.ui.Component findMain() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Main", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Main", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findPassword(Component root) {
        return (com.codename1.ui.Component)findByName("Password", root);
    }

    public com.codename1.ui.Component findPassword() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_RequestAccessSend = 3;
    public static final int COMMAND_LoginFormSend = 5;
    public static final int COMMAND_MainRequestAccess = 4;

    protected boolean onRequestAccessSend() {
        return false;
    }

    protected boolean onLoginFormSend() {
        return false;
    }

    protected boolean onMainRequestAccess() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_RequestAccessSend:
                if(onRequestAccessSend()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_LoginFormSend:
                if(onLoginFormSend()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainRequestAccess:
                if(onMainRequestAccess()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("RequestAccess".equals(f.getName())) {
            exitRequestAccess(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            exitLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitRequestAccess(Form f) {
    }


    protected void exitLoginForm(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("RequestAccess".equals(f.getName())) {
            beforeRequestAccess(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            beforeLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeRequestAccess(Form f) {
    }


    protected void beforeLoginForm(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("RequestAccess".equals(c.getName())) {
            beforeContainerRequestAccess(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(c.getName())) {
            beforeContainerLoginForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerRequestAccess(Container c) {
    }


    protected void beforeContainerLoginForm(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("RequestAccess".equals(f.getName())) {
            postRequestAccess(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            postLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postRequestAccess(Form f) {
    }


    protected void postLoginForm(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("RequestAccess".equals(c.getName())) {
            postContainerRequestAccess(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(c.getName())) {
            postContainerLoginForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerRequestAccess(Container c) {
    }


    protected void postContainerLoginForm(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("RequestAccess".equals(rootName)) {
            onCreateRequestAccess();
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(rootName)) {
            onCreateLoginForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateRequestAccess() {
    }


    protected void onCreateLoginForm() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("RequestAccess".equals(f.getName())) {
            getStateRequestAccess(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("LoginForm".equals(f.getName())) {
            getStateLoginForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateRequestAccess(Form f, Hashtable h) {
    }


    protected void getStateLoginForm(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("RequestAccess".equals(f.getName())) {
            setStateRequestAccess(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            setStateLoginForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateRequestAccess(Form f, Hashtable state) {
    }


    protected void setStateLoginForm(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("RequestAccess")) {
            if("Button".equals(c.getName())) {
                onRequestAccess_ButtonAction(c, event);
                return;
            }
            if("TextField".equals(c.getName())) {
                onRequestAccess_TextFieldAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("LoginForm")) {
            if("Username".equals(c.getName())) {
                onLoginForm_UsernameAction(c, event);
                return;
            }
            if("Password".equals(c.getName())) {
                onLoginForm_PasswordAction(c, event);
                return;
            }
            if("Remember".equals(c.getName())) {
                onLoginForm_RememberAction(c, event);
                return;
            }
            if("ResetPassword".equals(c.getName())) {
                onLoginForm_ResetPasswordAction(c, event);
                return;
            }
            if("Login".equals(c.getName())) {
                onLoginForm_LoginAction(c, event);
                return;
            }
            if("Cancel".equals(c.getName())) {
                onLoginForm_CancelAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("RequesteAccess".equals(c.getName())) {
                onMain_RequesteAccessAction(c, event);
                return;
            }
        }
    }

      protected void onRequestAccess_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onRequestAccess_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_UsernameAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_RememberAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_ResetPasswordAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_LoginAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_CancelAction(Component c, ActionEvent event) {
      }

      protected void onMain_RequesteAccessAction(Component c, ActionEvent event) {
      }

}
