import org.gradle.api.Project
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun createMarkdownDirectory(project: Project): Path =
    buildDirectory(project)

private fun buildDirectory(project: Project, dir: String = "markdown"): Path {
    val markdownPath = Paths.get(
        project.rootDir.absolutePath,
        "build",
        dir
    )
    Files.createDirectories(markdownPath)
    return markdownPath
}
