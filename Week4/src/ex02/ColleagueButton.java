package ex02;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }
    // Mediator 를 보관
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    // Mediator 가 유효/무효를 지시(버튼 클릭이 가능한지 불가능한지)
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
