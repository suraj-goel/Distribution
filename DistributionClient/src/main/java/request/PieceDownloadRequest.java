package request;

import constants.RequestCode;
import data.File;

public class PieceDownloadRequest extends Request {
    File file;
    String pieceID;
    public PieceDownloadRequest(File file , String pieceID){
        this.file = file;
        this.pieceID = pieceID;
    }

    public File getFile() {
        return file;
    }

    public String getPieceID() {
        return pieceID;
    }

    @Override
    public RequestCode getRequestCode() {
        return RequestCode.PIECEDOWNLOAD_REQUEST;
    }
}
