package com.mafengwo.zhjh.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.vfs.VirtualFile;
import com.mafengwo.zhjh.tools.Log;

public class RightButtonTest extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        DataContext dataContext = e.getDataContext();
        VirtualFile vf = DataKeys.VIRTUAL_FILE.getData(dataContext);
        Log.i("右旋中的："+vf.getPath());
    }

    @Override
    public void update(AnActionEvent e) {
        super.update(e);
    }
}
