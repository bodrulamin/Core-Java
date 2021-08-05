package com.company;

import java.util.ArrayList;
import java.util.List;

public class Msg {
    public void showMainMsg() {
        List<String> mainMsg = new ArrayList<>();
        mainMsg.add("Check Balance");
        mainMsg.add("Send Money");
        mainMsg.add("Mobile Recharge");
        mainMsg.add("Cash Out");
        mainMsg.add("Cash In");

        showMsg(mainMsg);
    }




    private void showMsg(List<String> mainMsg) {
        for (int i = 0; i < mainMsg.size(); i++) {
            System.out.println((i + 1) + ". " + mainMsg.get(i));

        }
    }


}
