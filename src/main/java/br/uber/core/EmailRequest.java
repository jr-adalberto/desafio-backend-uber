package br.uber.core;

public record EmailRequest(String to, String subject, String body) {
}
