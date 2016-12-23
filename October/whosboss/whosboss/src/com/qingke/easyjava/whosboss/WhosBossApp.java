package com.qingke.easyjava.whosboss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.qingke.easyjava.whosboss.bean.MessageConstants;
import com.qingke.easyjava.whosboss.bean.Region;
import com.qingke.easyjava.whosboss.bean.UserCommand;
import com.qingke.easyjava.whosboss.utils.QingkeConsole;
import com.qingke.easyjava.whosboss.utils.TxtRegionsReader;

/**
 * The Application launcher.
 * 
 * @author Qingke.me
 */
public class WhosBossApp {

    private static WhosBossService service;

    /**
     * Application Entrance.
     * @param args the system arguments
     */
    public static void main(String[] args) {
        initialize();

        QingkeConsole.println(MessageConstants.MESSAGE_WELCOME);
        while (true) {
            String userInputCommandLine = QingkeConsole.askUserInput(MessageConstants.MESSAGE_COMMAND, false);

            UserCommand command = parseUserCommand(userInputCommandLine);
            service.executeCommand(command);
        }
    }

    private static void initialize(){
        Map<String, Region> regionMap = new TxtRegionsReader().readRegions(null);

        service = new WhosBossService(regionMap);
    }

    private static UserCommand parseUserCommand(String commandLine) {
        String[] patterns = commandLine.split(" ");
        
        String cmd = patterns[0];
        String mode = null;
        List<String> params = new ArrayList<>();

        if (patterns.length > 1) {
            for (String pattern : Arrays.copyOfRange(patterns, 1, patterns.length)) {
                if (pattern.startsWith("-")) {
                    mode = pattern.substring(1);
                } else {
                    params.add(pattern);
                }
            }
        }

        return new UserCommand(cmd, mode, params.toArray(new String[params.size()]));
    }
}
