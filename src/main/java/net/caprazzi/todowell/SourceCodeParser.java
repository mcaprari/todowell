package net.caprazzi.todowell;

import java.io.IOException;
import java.nio.file.Path;

public class SourceCodeParser {

    private final SourceFileScanner scanner;
    private final CommentParser commentParser;
    private final TodoParser todoParser;

    public SourceCodeParser(SourceFileScanner scanner, CommentParser commentParser, TodoParser todoParser) {
        this.scanner = scanner;
        this.commentParser = commentParser;
        this.todoParser = todoParser;
    }

    public Iterable<Todo> parse(Path source) throws IOException {
        Iterable<SourceFile> sourceFiles = scanner.scan(source);
        Iterable<CommentLine> comments = commentParser.parse(sourceFiles);
        return todoParser.parse(comments);
    }
}
