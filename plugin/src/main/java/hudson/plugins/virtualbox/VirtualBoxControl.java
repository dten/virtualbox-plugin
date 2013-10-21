package hudson.plugins.virtualbox;

import java.util.List;

/**
 * @author Mihai Serban
 */
public interface VirtualBoxControl {
  public long startVm(VirtualBoxMachine machine, String snapshotName, String virtualMachineType, VirtualBoxLogger log);
  public long stopVm(VirtualBoxMachine machine, String snapshotName, String virtualMachineStopMode, VirtualBoxLogger log);

  public List<VirtualBoxMachine> getMachines(VirtualBoxCloud host, VirtualBoxLogger log);
  public String[] getSnapshots(String virtualMachineName, VirtualBoxSystemLog log);
  public String getMacAddress(VirtualBoxMachine machine, VirtualBoxLogger log);
  public void disconnect();

  public boolean isConnected();
}
