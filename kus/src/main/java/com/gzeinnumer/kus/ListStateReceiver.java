package com.gzeinnumer.kus;

import java.util.List;

public interface ListStateReceiver<T> {
    List<T> listReceived();
}
