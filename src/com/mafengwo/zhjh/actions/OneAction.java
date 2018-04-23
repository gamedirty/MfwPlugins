package com.mafengwo.zhjh.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import com.intellij.openapi.vfs.impl.VirtualFileManagerImpl;
import com.mafengwo.zhjh.tools.Log;

import java.io.File;
import java.io.IOException;

public class OneAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        VirtualFile img = VirtualFileManager.getInstance().findFileByUrl("https://b-ssl.duitang.com/uploads/item/201609/23/20160923220045_jZNXK.jpeg");

        long lenth = img.getLength();
        Log.i("总共多长啊：" + lenth);
//        EditDialog dialog = new EditDialog();
        showProject(e);
    }

    private void showProject(AnActionEvent event) {
        Project mProject = event.getData(PlatformDataKeys.PROJECT);
        DataContext dataContext = event.getDataContext();
        VirtualFile file = DataKeys.VIRTUAL_FILE.getData(event.getDataContext());
        VirtualFile fileParent = file.getParent();
        VirtualFile baseFile = mProject.getBaseDir();
        VirtualFile[] childs = baseFile.getChildren();

        for (VirtualFile file1:childs){
            Log.i("文件名字："+file1.getPath());

        }
    }
}
