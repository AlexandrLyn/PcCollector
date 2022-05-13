package UpdateDB;

public class StorageUrlOffice extends StorageUrl{

    @Override
    protected String[] gpuUrl() {
        return gpu;
    }

    @Override
    protected String[] motherBoardUrl() {
        return new String[0];
    }

    @Override
    protected String[] ramUrl() {
        return new String[0];
    }

    @Override
    protected String[] cpuUrl() {
        return new String[0];
    }

    @Override
    protected String[] blockPowerUrl() {
        return new String[0];
    }

    @Override
    protected String[] casePcUrl() {
        return new String[0];
    }

    @Override
    protected String[] hddUrl() {
        return new String[0];
    }

    @Override
    protected String[] ssdUrl() {
        return new String[0];
    }

    @Override
    protected String[] coolingUrl() {
        return new String[0];
    }
}
