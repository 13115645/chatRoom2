package com.ydprojects.message;

import com.ydprojects.server.ServerCommands;
import com.ydprojects.utils.MessageEncryption;

import java.io.Serializable;

public class Message implements Serializable {

    private String message;
    private ServerCommands serverCommand;

    public Message(String message) {
        this.message = MessageEncryption.encrypt(message);
        this.serverCommand = ServerCommands.STAY_CONNECTED;
    }

    public Message (ServerCommands serverCommands){
        this.serverCommand = serverCommands;
    }

    public String getMessage() {
        return message;
    }

    public ServerCommands getSeverCommand() {
        return serverCommand;
    }

    public void setServerCommand(ServerCommands serverCommands) {
        this.serverCommand = serverCommands;
    }
}
