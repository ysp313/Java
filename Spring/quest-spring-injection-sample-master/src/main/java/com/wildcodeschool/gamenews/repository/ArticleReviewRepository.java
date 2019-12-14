package com.wildcodeschool.gamenews.repository;

import com.wildcodeschool.gamenews.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class ArticleReviewRepository implements ReviewDao {

    @Autowired
    @Qualifier("articleReview")
    private Review review;

    @Override
    public void sendGame(String game) {
        review.setTitle(game);
    }

    @Override
    public void review() {
        String[] reviews = {
            "Worst game ever made!",
            "Best game ever made!",
            "So-so...",
        };
        Random rand = new Random();
        review.setContent(reviews[rand.nextInt(3)]);
        review.setScore(new Random().nextInt(6));
    }

    @Override
    public Review getReview() {

        return review;
    }
}