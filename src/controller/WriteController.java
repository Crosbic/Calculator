package controller;

import model.write.WriterExpressionService;


public class WriteController {
    private final WriterExpressionService writerExpressionService;

    public WriteController(WriterExpressionService writerExpressionService){
        this.writerExpressionService = writerExpressionService;
    }

    public void WriteToFile(String str) {
        writerExpressionService.write(str);
    }
}
