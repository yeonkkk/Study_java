public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후 다시 설치하시기 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
            System.gc();        // Garbage Collection 수행
            System.out.println("다시 설치를 시도하세요");
        }finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace()) throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory()) throw new MemoryException("메모리가 부족합니다.");
    }

    static void copyFiles() {/*파일 복사 코드를 적는다*/}
    static void deleteTempFiles() {/*임시 파일들을 삭제하는 코드를 적는다*/}

    static boolean enoughSpace() {
        /* 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다 */
        return false;
    }

    static boolean enoughMemory() {
        // 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드를 적는다.
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
