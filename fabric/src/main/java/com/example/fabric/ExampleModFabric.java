package com.example.fabric;

import net.fabricmc.api.ModInitializer;

import com.example.ExampleMod;
import org.apache.sshd.common.NamedResource;
import org.eclipse.jgit.gitrepo.RepoCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ExampleModFabric implements ModInitializer {
    private static final Logger log = LoggerFactory.getLogger(ExampleModFabric.class);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        log.info(RepoCommand.class.getTypeName()); // works
        log.info(NamedResource.class.getTypeName()); // works

        // Run our common setup.
        ExampleMod.init();
    }
}
