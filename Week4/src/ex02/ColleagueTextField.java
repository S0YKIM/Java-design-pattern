package ex02;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    // 생성자
    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }
    // Mediator를 보관
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    // Mediator 가 유효/무효를 지시(텍스트 필드에 텍스트 입력이 가능한지 불가능한지)
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    // 문자열이 변하면 Mediator 에게 통지
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged(this);
    }

}