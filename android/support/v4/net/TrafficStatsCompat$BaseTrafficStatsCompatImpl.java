package android.support.v4.net;

import java.net.Socket;

class TrafficStatsCompat$BaseTrafficStatsCompatImpl
  implements TrafficStatsCompat.TrafficStatsCompatImpl
{
  private ThreadLocal<SocketTags> mThreadSocketTags = new ThreadLocal()
  {
    protected TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags initialValue()
    {
      return new TrafficStatsCompat.BaseTrafficStatsCompatImpl.SocketTags(null);
    }
  };

  TrafficStatsCompat$BaseTrafficStatsCompatImpl()
  {
  }

  public void clearThreadStatsTag()
  {
    ((SocketTags)this.mThreadSocketTags.get()).statsTag = -1;
  }

  public int getThreadStatsTag()
  {
    return ((SocketTags)this.mThreadSocketTags.get()).statsTag;
  }

  public void incrementOperationCount(int paramInt)
  {
  }

  public void incrementOperationCount(int paramInt1, int paramInt2)
  {
  }

  public void setThreadStatsTag(int paramInt)
  {
    ((SocketTags)this.mThreadSocketTags.get()).statsTag = paramInt;
  }

  public void tagSocket(Socket paramSocket)
  {
  }

  public void untagSocket(Socket paramSocket)
  {
  }

  private static class SocketTags
  {
    public int statsTag = -1;

    private SocketTags()
    {
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.net.TrafficStatsCompat.BaseTrafficStatsCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */