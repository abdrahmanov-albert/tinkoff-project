package ru.tinkoff.edu.java.bot.dto;

import ru.tinkoff.edu.java.bot.Model.Link;

import java.util.List;

public record ListLinkResponse(List<Link> links, int size) {}
