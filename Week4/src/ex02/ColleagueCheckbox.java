package ex02;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    // 생성자
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }
    // Mediator 를 보관
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    // Mediator 가 유효/무효를 지시(체크박스 체크가 가능한지 불가능한지)
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
    // 체크박스 상태가 변하면 Mediator 에게 통지
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged(this);
    }

}
