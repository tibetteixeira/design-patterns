package io.tibetteixeira.behavioral.state.headphone;

import io.tibetteixeira.behavioral.state.headphone.state.HeadPhoneState;
import io.tibetteixeira.behavioral.state.headphone.state.OffState;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HeadPhone {

  private HeadPhoneState state = OffState.getInstance();
  private boolean playing = false;

  @Setter(AccessLevel.NONE)
  private boolean on = false;

  public void onClick() {
      System.out.println("> Click pressed");
      state.click(this);
  }

  public void onLongClick() {
      System.out.println("> Long click pressed");
      state.longClick(this);
  }

  public void isOn(boolean state) {
      this.on = state;

      if (!state) {
          this.playing = state;
      }
  }
}
