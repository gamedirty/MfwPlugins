package com.mafengwo.zhjh.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.vfs.VirtualFile;
import com.mafengwo.zhjh.tools.Log;

public class ChooseFileAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        FileChooserDescriptor fileChooserDescriptor = FileChooserDescriptorFactory.createSingleFileDescriptor();
        fileChooserDescriptor.setTitle("性感的哟");
        VirtualFile vf = FileChooser.chooseFile(fileChooserDescriptor, e.getProject(), e.getProject().getBaseDir());
        Log.i("选中的文件是："+vf.getPath());

    }
}
