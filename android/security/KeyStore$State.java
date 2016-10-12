package android.security;

public enum KeyStore$State
{
  static
  {
    LOCKED = new State("LOCKED", 1);
    UNINITIALIZED = new State("UNINITIALIZED", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = UNLOCKED;
    arrayOfState[1] = LOCKED;
    arrayOfState[2] = UNINITIALIZED;
  }
}

/* Location:
 * Qualified Name:     android.security.KeyStore.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */