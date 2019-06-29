package nextstep.ladder.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by wyparks2@gmail.com on 2019-06-29
 * Blog : http://wyparks2.github.io
 * Github : http://github.com/wyparks2
 */
public class Ladder {
    private List<Line> lines;

    public Ladder(int rowSize) {
        if (rowSize < 1) {
            throw new IllegalArgumentException("사다리 높이는 1이상이여야 합니다.");
        }

        this.lines = IntStream.rangeClosed(1, rowSize)
                .boxed()
                .map(Line::init)
                .collect(Collectors.toList());
    }

    public int size() {
        return this.lines.size();
    }
}