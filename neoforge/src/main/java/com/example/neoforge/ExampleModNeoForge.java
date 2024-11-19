package com.example.neoforge;

import net.neoforged.fml.common.Mod;

import org.eclipse.jgit.gitrepo.RepoCommand;
import org.apache.sshd.common.NamedResource;

import com.example.ExampleMod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    private static final Logger log = LoggerFactory.getLogger(ExampleModNeoForge.class);

    public ExampleModNeoForge() {
        log.info(RepoCommand.class.getTypeName()); // works
        log.info(NamedResource.class.getTypeName()); // java.lang.NoClassDefFoundError

        // Run our common setup.
        ExampleMod.init();
    }
}
