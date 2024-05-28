package br.univille.log;

public class Main {
    public static void main(String[] args) {
        // Criar logger para o console
        Logger consoleLogger = LoggerFactory.onConsole();

        // Criar logger para o arquivo
        Logger fileLogger = LoggerFactory.onFile("log.txt");

        // Registrar mensagens no console
        consoleLogger.log(Level.DEBUG, "This is a debug message.");
        consoleLogger.log(Level.WARNING, "This is a warning message.");
        consoleLogger.log(Level.ERROR, "This is an error message.");

        // Registrar mensagens no arquivo
        fileLogger.log(Level.DEBUG, "This is a debug message.");
        fileLogger.log(Level.WARNING, "This is a warning message.");
        fileLogger.log(Level.ERROR, "This is an error message.");
    }
}