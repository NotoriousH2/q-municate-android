package com.quickblox.q_municate.chat;


import android.arch.lifecycle.LiveData;

import com.example.q_municate_chat_service.entity.user.QMUser;
import com.quickblox.chat.model.QBChatDialog;

import java.util.List;

public interface ChatConnectionProvider {

    LiveData<List<QBChatDialog>> loadDialogs(boolean forceLoad);

    LiveData<List<QMUser>> loadDialogData(String dlgId);

    LiveData<List<QMUser>> loadDialog(String dlgId);

}
