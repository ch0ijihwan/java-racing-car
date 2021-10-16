package model.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistanceTest {
    Distance distance;

    @Test
    @DisplayName("첫 객체 생성시 거리를 0으로 초기화 하는지 확인")
    void checkDistanceWhenCreate() {
        //given
        distance = new Distance();

        //when
        int actual = distance.value();

        //then
        assertThat(actual).isZero();
    }

    @Test
    @DisplayName("이동거리를 입력 받으면, 그 거리 만큼 movingRecord를 변화시키는지 확인하는 테스트 코드")
    void moveValue() {
        //given
        distance = new Distance();
        int expect = 1;

        //when
        distance.update(1);
        int actual = distance.value();

        //then
        assertThat(actual).isEqualTo(expect);
    }
}
