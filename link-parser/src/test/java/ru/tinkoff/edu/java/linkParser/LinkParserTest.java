package ru.tinkoff.edu.java.linkParser;

import org.junit.Assert;
import org.junit.Test;
import ru.tinkoff.edu.java.linkParser.GithubParser;
import ru.tinkoff.edu.java.linkParser.StackOverflowParser;

import java.net.URISyntaxException;

public class LinkParserTest {

    @Test
    public void GitHubValidTest() throws URISyntaxException {
        String URL = "https://github.com/beba/pro";
        GithubParser linkParser = new GithubParser();
        Assert.assertEquals(new String[]{"beba"}[0],linkParser.parse(URL)[0]);
        Assert.assertEquals(new String[]{"beba","pro"}[1],linkParser.parse(URL)[1]);
    }
    @Test
    public void StackOverflowValidTest() throws URISyntaxException {
        String URL = "https://stackoverflow.com/questions/47179937/how-to-get-string-from-monostring-in-reactive-java";
        StackOverflowParser linkParser = new StackOverflowParser();
        Assert.assertEquals("47179937",linkParser.parse(URL)[0]);
    }
    @Test
    public void InvalidTest() throws URISyntaxException {
        String URL = "fwefwfwe";
        GithubParser linkParser = new GithubParser();
        Assert.assertEquals("",linkParser.parse(URL)[0]);
    }
}