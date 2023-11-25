package main.controller.report;

import main.model.camp.Camp;
import main.utils.exception.ModelNotFoundException;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * Interface for generating an performance list
 * --> this acts as a contract for any other class implementing in this future
 */
public interface PerformanceReportGenerator {
    /**
     * A function to generate the performance list txt upon giving the camp
     * @param camp --> which camp's attendee list do we want to generate
     */
    public void generatePerformanceReport(Camp camp);
    /**
     *  This is a method to write the camp details to the given file
     * @param writer the file to which we want to write
     * @param camp for which camp we want the details
     * @throws IOException when there is an issue writing data to the file
     * @throws ModelNotFoundException when it cant find the camp from the camp repository
     */
    public void writeCampDetails(BufferedWriter writer, Camp camp) throws IOException, ModelNotFoundException;
    /**
     *  This is a method to write the performance details to the given file
     * @param writer the file to which we want to write
     * @param camp for which camp we want the details
     * @throws IOException when there is an issue writing data to the file
     * @throws ModelNotFoundException when it cant find the camp from the camp repository
     */
    public void writePerformanceDetails(Writer writer, Camp camp) throws IOException, ModelNotFoundException;

}
