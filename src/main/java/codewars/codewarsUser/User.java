package codewars.codewarsUser;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int rank;
    public int progress;
    private int rankIndex;

    private final List<Integer> rankList = new ArrayList<>();

    private final int TOP_RANK_BOUND;

    public User() {
        this(8);
    }

    public User(int rankBound) {
        TOP_RANK_BOUND = Math.abs(rankBound);
        this.rank = -TOP_RANK_BOUND;
        this.progress = 0;
        this.rankIndex = 0;
        initializeRankList();
    }

    private void initializeRankList() {
        int rankBound = Math.abs(TOP_RANK_BOUND);
        for (int i = -rankBound; i <= rankBound; i++) {
            if (i != 0) {
                rankList.add(i);
            }
        }
    }

    public void incProgress(int taskRank) throws IllegalArgumentException {
        if (!rankList.contains(taskRank)) {
            throw new IllegalArgumentException();
        }
        if (rank == TOP_RANK_BOUND) {
            return;
        }
        this.rankIndex = rankList.indexOf(this.rank);
        int taskRankIndex = rankList.indexOf(taskRank);
        int delta = this.rankIndex - taskRankIndex;
        if (delta >= 2) {
            return;
        }
        if (delta == 1) {
            updateUserData(1);
        } else if (delta == 0) {
            updateUserData(3);
        } else {
            updateUserData(10 * delta * delta);
        }
    }

    private void updateUserData(int progressDelta) {
        this.progress += progressDelta;
        if (this.progress >= 100) {
            this.rankIndex += this.progress / 100;
            if (this.rankIndex == 2 * TOP_RANK_BOUND - 1) {
                this.progress = 0;
                this.rank = TOP_RANK_BOUND;
            } else {
                this.progress = this.progress % 100;
                this.rank = rankList.get(rankIndex);
            }

        }
    }
}
