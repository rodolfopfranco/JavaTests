package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {
    //Sempre que for definida uma configuração com a notação @Rule, executada antes dos testes iniciarem.
    //E pode ser usada por eles.
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");

        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
