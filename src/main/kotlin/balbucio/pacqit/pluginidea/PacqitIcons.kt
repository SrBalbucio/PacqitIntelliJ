package balbucio.pacqit.pluginidea

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class PacqitIcons {
    companion object {
        var logo: Icon = IconLoader.getIcon("/assets/pacqit.svg", PacqitIcons.javaClass);
    }
}