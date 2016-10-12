package android.support.v4.app;

class FragmentManagerImpl$3
  implements Runnable
{
  FragmentManagerImpl$3(FragmentManagerImpl paramFragmentManagerImpl, String paramString, int paramInt)
  {
  }

  public void run()
  {
    this.this$0.popBackStackState(this.this$0.mActivity.mHandler, this.val$name, -1, this.val$flags);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentManagerImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */