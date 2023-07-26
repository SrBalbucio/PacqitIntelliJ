package balbucio.pacqit.pluginidea.action.maven

import balbucio.pacqit.pluginidea.PacqitIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ConvertMavenToPacqitAction:AnAction("Convert to Pacqit Project", "Converts a Maven project to a Pacqit project.", PacqitIcons.logo) {
    override fun actionPerformed(event: AnActionEvent) {
        val project = event.project
        val file = event.dataContext.getData("virtualFile") as? com.intellij.openapi.vfs.VirtualFile
        var filePath = file?.path;

        if(file != null){
            
        }
    }

    override fun update(event: AnActionEvent) {
        val project = event.project
        val file = event.dataContext.getData("virtualFile") as? com.intellij.openapi.vfs.VirtualFile
        event.presentation.isEnabled = project != null && file?.name == "pom.xml"
    }
}