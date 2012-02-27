package com.jayway.maven.plugins.android.standalonemojos;


import com.android.tools.lint.checks.BuiltinIssueRegistry;
import com.android.tools.lint.client.api.IDomParser;

import com.android.tools.lint.client.api.Lint;
import com.android.tools.lint.client.api.LintClient;
import com.android.tools.lint.detector.api.Context;
import com.android.tools.lint.detector.api.Issue;
import com.android.tools.lint.detector.api.Location;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Produce a report with the Android Lint tool.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 * @goal lint
 * @requiresProject true
 */
public class LintMojo extends AbstractMojo {
    /**
     * The maven project.
     *
     * @parameter expression="${project}"
     * @required
     * @readonly
     */
    protected MavenProject project;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        BuiltinIssueRegistry builtinIssueRegistry = new BuiltinIssueRegistry();
        Lint lint = new Lint(builtinIssueRegistry, new MavenLintClient());
        
        List<File> fileList = new ArrayList<File>();
        fileList.add(project.getBasedir());
        lint.analyze(fileList, null);
    }

    class MavenLintClient extends LintClient {

        @Override
        public void report(Context context, Issue issue, Location location, String message, Object data) {
            // I would like to juse use HtmlReporter . but it is not a public class...
            HtmlReporter reporter
            new //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public void log(Throwable exception, String format, Object... args) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public IDomParser getParser() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String readFile(File file) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
