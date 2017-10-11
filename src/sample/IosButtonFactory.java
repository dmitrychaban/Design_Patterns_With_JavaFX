package sample;

import javafx.scene.control.Button;

/**
 * Created by dim3coder on 10/11/17.
 */
public class IosButtonFactory implements AbstractButtonFactory {

  @Override
  public Button getOSButton(String name) {
    return new IosButton(name);
  }

}
