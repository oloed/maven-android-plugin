package com.jayway.maven.plugins.android.standalonemojos;

import com.android.tools.lint.Main;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Produce a report with the Android Lint tool.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 * @goal lint
 * @requiresProject true
 */
public class LintMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
